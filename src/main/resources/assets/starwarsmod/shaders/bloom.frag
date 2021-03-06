//
// Structure definitions
//

struct VS_OUTPUT {
    vec4 Position;
    vec4 Color;
    vec2 TexCoord0;
    vec4 TexCoord12;
    vec4 TexCoord34;
    vec4 TexCoord56;
    vec4 TexCoord78;
    vec4 TexCoord9A;
};

struct VS_INPUT {
    vec4 Position;
    vec4 Color;
    vec2 TexCoord;
};

struct PS_INPUT {
    vec4 Color;
    vec2 TexCoord0;
    vec4 TexCoord12;
    vec4 TexCoord34;
    vec4 TexCoord56;
    vec4 TexCoord78;
    vec4 TexCoord9A;
};


//
// Global variable definitions
//

uniform int BloomBlendMode;
uniform vec3 BloomOverdrive;
uniform float BloomScale;
uniform sampler2D DiffuseSampler0;
uniform sampler2D DiffuseSampler1;
uniform sampler2D DiffuseSampler2;
uniform sampler2D DiffuseSampler3;
uniform sampler2D DiffuseSampler4;
uniform sampler2D DiffuseSampler5;
uniform sampler2D DiffuseSampler6;
uniform sampler2D DiffuseSampler7;
uniform sampler2D DiffuseSampler8;
uniform sampler2D DiffuseSampler9;
uniform sampler2D DiffuseSamplerA;
uniform float Level0Weight;
uniform vec2 Level12Weight;
uniform vec2 Level34Weight;
uniform vec2 Level56Weight;
uniform vec2 Level78Weight;
uniform vec2 Level9AWeight;

//
// Function declarations
//

vec4 ps_main( in PS_INPUT Input );
vec3 GetNoiseFactor( in vec3 n, in float random );
float random( in vec2 seed );

//
// Function definitions
//

vec4 ps_main( in PS_INPUT Input ) {
    vec3 texel0;
    vec3 texel1;
    vec3 texel2;
    vec3 texel3;
    vec3 texel4;
    vec3 texel5;
    vec3 texel6;
    vec3 texel7;
    vec3 texel8;
    vec3 texel9;
    vec3 texelA;
    vec3 bloom;
    vec3 bloomOverdrive;
    vec2 NoiseCoord;
    vec3 NoiseFactor;
    vec3 blend;

    texel0 = texture2D( DiffuseSampler0, Input.TexCoord0).xyz ;
    texel1 = texture2D( DiffuseSampler1, Input.TexCoord12.xy ).xyz ;
    texel2 = texture2D( DiffuseSampler2, Input.TexCoord12.zw ).xyz ;
    texel3 = texture2D( DiffuseSampler3, Input.TexCoord34.xy ).xyz ;
    texel4 = texture2D( DiffuseSampler4, Input.TexCoord34.zw ).xyz ;
    texel5 = texture2D( DiffuseSampler5, Input.TexCoord56.xy ).xyz ;
    texel6 = texture2D( DiffuseSampler6, Input.TexCoord56.zw ).xyz ;
    texel7 = texture2D( DiffuseSampler7, Input.TexCoord78.xy ).xyz ;
    texel8 = texture2D( DiffuseSampler8, Input.TexCoord78.zw ).xyz ;
    texel9 = texture2D( DiffuseSampler9, Input.TexCoord9A.xy ).xyz ;
    texelA = texture2D( DiffuseSamplerA, Input.TexCoord9A.zw ).xyz ;
    if ( (BloomBlendMode == 0) ){
        texel0 *= Level0Weight;
        texel1 *= Level12Weight.x ;
        texel2 *= Level12Weight.y ;
        texel3 *= Level34Weight.x ;
        texel4 *= Level34Weight.y ;
        texel5 *= Level56Weight.x ;
        texel6 *= Level56Weight.y ;
        texel7 *= Level78Weight.x ;
        texel8 *= Level78Weight.y ;
        texel9 *= Level9AWeight.x ;
        texelA *= Level9AWeight.y ;
        bloom = (vec3( (((((((((texel1 + texel2) + texel3) + texel4) + texel5) + texel6) + texel7) + texel8) + texel9) + texelA)) * BloomScale);
        bloomOverdrive = (max( 0.000000, float( ((texel0 + bloom) - 1.00000))) * BloomOverdrive);
        bloom.x  += (bloomOverdrive.y  * 0.500000);
        bloom.x  += (bloomOverdrive.z  * 0.500000);
        bloom.y  += (bloomOverdrive.x  * 0.500000);
        bloom.y  += (bloomOverdrive.z  * 0.500000);
        bloom.z  += (bloomOverdrive.x  * 0.500000);
        bloom.z  += (bloomOverdrive.y  * 0.500000);
        NoiseCoord = Input.TexCoord0;
        NoiseFactor = GetNoiseFactor( bloom, random( NoiseCoord));
        blend = (texel0 + (bloom * NoiseFactor));
    }
    else{
        texel1 = min( texel0, texel1);
        texel2 = min( texel0, texel2);
        texel3 = min( texel0, texel3);
        texel4 = min( texel0, texel4);
        texel5 = min( texel0, texel5);
        texel6 = min( texel0, texel6);
        texel7 = min( texel0, texel7);
        texel8 = min( texel0, texel8);
        texel9 = min( texel0, texel9);
        texelA = min( texel0, texelA);
        blend = (texel0 * Level0Weight);
        blend = mix( blend, texel1, vec3( (Level12Weight.x  * BloomScale)));
        blend = mix( blend, texel2, vec3( (Level12Weight.y  * BloomScale)));
        blend = mix( blend, texel3, vec3( (Level34Weight.x  * BloomScale)));
        blend = mix( blend, texel4, vec3( (Level34Weight.y  * BloomScale)));
        blend = mix( blend, texel5, vec3( (Level56Weight.x  * BloomScale)));
        blend = mix( blend, texel6, vec3( (Level56Weight.y  * BloomScale)));
        blend = mix( blend, texel7, vec3( (Level78Weight.x  * BloomScale)));
        blend = mix( blend, texel8, vec3( (Level78Weight.y  * BloomScale)));
        blend = mix( blend, texel9, vec3( (Level9AWeight.x  * BloomScale)));
        blend = mix( blend, texelA, vec3( (Level9AWeight.y  * BloomScale)));
    }
    return vec4( blend, 1.00000);
}


vec3 GetNoiseFactor( in vec3 n, in float random ) {

    return vec3( (1.00000 + (random * max( 0.000000, (0.250000 * pow( 2.71828, float( (-8.00000 * n))))))));
}


float random( in vec2 seed ) {
    vec2 i = vec2( 23.1407, 2.66514);

    return fract( (cos( dot( seed, i) ) * 123456.) );
}


//
// Translator's entry point
//
void main() {
    vec4 xlat_retVal;
    PS_INPUT xlat_temp_Input;
    xlat_temp_Input.Color = vec4( gl_Color);
    xlat_temp_Input.TexCoord0 = vec2( gl_TexCoord[0]);
    xlat_temp_Input.TexCoord12 = vec4( gl_TexCoord[1]);
    xlat_temp_Input.TexCoord34 = vec4( gl_TexCoord[2]);
    xlat_temp_Input.TexCoord56 = vec4( gl_TexCoord[3]);
    xlat_temp_Input.TexCoord78 = vec4( gl_TexCoord[4]);
    xlat_temp_Input.TexCoord9A = vec4( gl_TexCoord[5]);

    xlat_retVal = ps_main( xlat_temp_Input);

    gl_FragData[0] = vec4( xlat_retVal);
}


 