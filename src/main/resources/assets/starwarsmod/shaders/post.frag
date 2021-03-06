//
// Structure definitions
//

struct VS_OUTPUT {
    vec4 Position;
    vec4 Color;
    vec2 TexCoord;
    vec2 ScreenCoord;
};

struct VS_INPUT {
    vec4 Position;
    vec4 Color;
    vec2 TexCoord;
};

struct PS_INPUT {
    vec4 Color;
    vec2 TexCoord;
    vec2 ScreenCoord;
};


//
// Global variable definitions
//

uniform vec3 BackColor;
uniform sampler2D DiffuseSampler;
uniform vec3 Floor;
uniform float HumBarAlpha;
uniform float HumBarHertzRate;
uniform vec3 Power;
uniform bool PrepareBloom;
uniform bool PrepareVector;
uniform float ScanlineAlpha;
uniform float ScanlineBrightOffset;
uniform float ScanlineBrightScale;
uniform float ScanlineHeight;
uniform float ScanlineOffset;
uniform float ScanlineScale;
uniform vec2 ScreenDims;
uniform vec2 ScreenOffset;
uniform vec2 ScreenScale;
uniform float ShadowAlpha;
uniform vec2 ShadowCount;
uniform vec2 ShadowDims;
uniform sampler2D ShadowSampler;
uniform int ShadowTileMode;
uniform vec2 ShadowUV;
uniform vec2 SourceDims;
uniform vec2 SourceRect;
uniform bool SwapXY;
uniform float TimeMilliseconds;

//
// Function declarations
//

vec4 ps_main( in PS_INPUT Input );
vec2 GetAdjustedCoords( in vec2 coord, in vec2 centerOffset );

//
// Function definitions
//

vec4 ps_main( in PS_INPUT Input ) {
    vec2 ScreenTexelDims;
    vec2 SourceTexelDims;
    vec2 SourceRes;
    vec2 HalfSourceRect;
    vec2 ScreenCoord;
    vec2 BaseCoord;
    vec4 BaseColor;
    vec2 shadowDims;
    vec2 shadowUV;
    vec2 screenCoord;
    vec2 shadowCount;
    vec2 shadowTile;
    vec2 ShadowFrac;
    vec2 ShadowCoord;
    vec4 ShadowColor;
    vec3 ShadowMaskColor;
    float ShadowMaskClear;
    float ScanCoord;
    float ScanCoordJitter;
    float ScanSine;
    float ScanSineScaled;
    float ScanBrightness;
    float HumTimeStep;
    float HumBrightness;
    vec4 Output;

    ScreenTexelDims = (1.00000 / ScreenDims);
    SourceTexelDims = (1.00000 / SourceDims);
    SourceRes = (SourceDims * SourceRect);
    HalfSourceRect = (SourceRect * 0.500000);
    ScreenCoord = (Input.ScreenCoord / ScreenDims);
    BaseCoord = GetAdjustedCoords( Input.TexCoord, HalfSourceRect);
    BaseColor = texture2D( DiffuseSampler, BaseCoord);
    BaseColor.w  = 1.00000;
    if ( ((BaseCoord.x  < 0.000000) || (BaseCoord.y  < 0.000000)) ){
        BaseColor.xyz  = vec3( 0.000000);
    }
    if ( (( !PrepareBloom ) && (ShadowAlpha > 0.000000)) ){
        shadowDims = ShadowDims;
        shadowDims = ( SwapXY ) ? ( shadowDims.yx  ) : ( shadowDims.xy  );
        shadowUV = ShadowUV;
        screenCoord = ( (ShadowTileMode == 0) ) ? ( ScreenCoord ) : ( BaseCoord );
        screenCoord = ( SwapXY ) ? ( screenCoord.yx  ) : ( screenCoord.xy  );
        shadowCount = ShadowCount;
        shadowCount = ( SwapXY ) ? ( shadowCount.yx  ) : ( shadowCount.xy  );
        shadowTile = (( (ShadowTileMode == 0) ) ? ( ScreenTexelDims ) : ( SourceTexelDims ) * shadowCount);
        shadowTile = ( SwapXY ) ? ( shadowTile.yx  ) : ( shadowTile.xy  );
        ShadowFrac = fract( (screenCoord / shadowTile) );
        ShadowCoord = (ShadowFrac * shadowUV);
        ShadowCoord += (0.500000 / shadowDims);
        ShadowColor = texture2D( ShadowSampler, ShadowCoord);
        ShadowMaskColor = vec3( mix( 1.00000, float( ShadowColor.xyz ), ShadowAlpha));
        ShadowMaskClear = ((1.00000 - ShadowColor.w ) * ShadowAlpha);
        BaseColor.xyz  *= ShadowMaskColor;
        BaseColor.xyz  = mix( BaseColor.xyz , BackColor, vec3( ShadowMaskClear));
    }
    if ( ( !PrepareBloom ) ){
        BaseColor.xyz  = (Floor + ((1.00000 - Floor) * BaseColor.xyz ));
    }
    BaseColor.x  = pow( BaseColor.x , Power.x );
    BaseColor.y  = pow( BaseColor.y , Power.y );
    BaseColor.z  = pow( BaseColor.z , Power.z );
    if ( ( !PrepareBloom ) ){
        if ( (( !PrepareVector ) && (ScanlineAlpha > 0.000000)) ){
            ScanCoord = (((BaseCoord.y  * SourceDims.y ) * ScanlineScale) * 3.14159);
            ScanCoordJitter = (ScanlineOffset * 1.61803);
            ScanSine = sin( (ScanCoord + ScanCoordJitter) );
            ScanSineScaled = pow( (ScanSine * ScanSine), ScanlineHeight);
            ScanBrightness = (((ScanSineScaled * ScanlineBrightScale) + 1.00000) + ScanlineBrightOffset);
            BaseColor.xyz  *= mix( 1.00000, (ScanBrightness * 0.500000), ScanlineAlpha);
        }
        if ( (( !PrepareVector ) && (HumBarAlpha > 0.000000)) ){
            HumTimeStep = fract( (TimeMilliseconds * HumBarHertzRate) );
            HumBrightness = (1.00000 - (fract( ((BaseCoord.y  / SourceRect.y ) + HumTimeStep) ) * HumBarAlpha));
            BaseColor.xyz  *= HumBrightness;
        }
    }
    Output = ( PrepareVector ) ? ( (BaseColor * (Input.Color + vec4( 1.00000, 1.00000, 1.00000, 0.000000))) ) : ( (BaseColor * Input.Color) );
    Output.w  = 1.00000;
    return Output;
}


vec2 GetAdjustedCoords( in vec2 coord, in vec2 centerOffset ) {

    coord -= centerOffset;
    coord /= ScreenScale;
    coord += centerOffset;
    coord += ((centerOffset * 2.00000) * ScreenOffset);
    return coord;
}


//
// Translator's entry point
//
void main() {
    vec4 xlat_retVal;
    PS_INPUT xlat_temp_Input;
    xlat_temp_Input.Color = vec4( gl_Color);
    xlat_temp_Input.TexCoord = vec2( gl_TexCoord[0]);
    xlat_temp_Input.ScreenCoord = vec2( gl_TexCoord[1]);

    xlat_retVal = ps_main( xlat_temp_Input);

    gl_FragData[0] = vec4( xlat_retVal);
}


 