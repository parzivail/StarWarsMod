// license:BSD-3-Clause
// copyright-holders:Ryan Holtz,ImJezze
//-----------------------------------------------------------------------------
// Downsample Effect
//-----------------------------------------------------------------------------

//-----------------------------------------------------------------------------
// Sampler Definitions
//-----------------------------------------------------------------------------

texture DiffuseTexture;

sampler DiffuseSampler = sampler_state
{
	Texture = <DiffuseTexture>;
	MipFilter = LINEAR;
	MinFilter = LINEAR;
	MagFilter = LINEAR;
	AddressU = CLAMP;
	AddressV = CLAMP;
	AddressW = CLAMP;
};

//-----------------------------------------------------------------------------
// Vertex Definitions
//-----------------------------------------------------------------------------

struct VS_OUTPUT
{
	float4 Position : POSITION;
	float4 Color : COLOR0;
	float4 TexCoord01 : TEXCOORD0;
	float4 TexCoord23 : TEXCOORD1;
};

struct VS_INPUT
{
	float4 Position : POSITION;
	float4 Color : COLOR0;
	float2 TexCoord : TEXCOORD0;
};

struct PS_INPUT
{
	float4 Color : COLOR0;
	float4 TexCoord01 : TEXCOORD0;
	float4 TexCoord23 : TEXCOORD1;
};

//-----------------------------------------------------------------------------
// Downsample Vertex Shader
//-----------------------------------------------------------------------------

uniform float2 ScreenDims;
uniform float2 TargetDims;
uniform float2 SourceRect;

uniform bool PrepareVector;

VS_OUTPUT vs_main(VS_INPUT Input)
{
	VS_OUTPUT Output = (VS_OUTPUT)0;

	float2 TargetTexelDims = 1.0f / TargetDims;

	Output.Position = float4(Input.Position.xyz, 1.0f);
	Output.Position.xy /= ScreenDims;
	Output.Position.y = 1.0f - Output.Position.y; // flip y
	Output.Position.xy -= 0.5f; // center
	Output.Position.xy *= 2.0f; // zoom

	Output.Color = Input.Color;

	float2 TexCoord = Input.Position.xy / ScreenDims;
	TexCoord += PrepareVector
		? 0.5f / TargetDims // half texel offset correction (DX9) - only for vector grpahics
		: 0.0f;

	Output.TexCoord01.xy = TexCoord + float2(-0.5f, -0.5f) * TargetTexelDims;
	Output.TexCoord01.zw = TexCoord + float2( 0.5f, -0.5f) * TargetTexelDims;
	Output.TexCoord23.xy = TexCoord + float2(-0.5f,  0.5f) * TargetTexelDims;
	Output.TexCoord23.zw = TexCoord + float2( 0.5f,  0.5f) * TargetTexelDims;

	return Output;
}

//-----------------------------------------------------------------------------
// Downsample Pixel Shader
//-----------------------------------------------------------------------------

float4 ps_main(PS_INPUT Input) : COLOR
{
	float3 texel0 = tex2D(DiffuseSampler, Input.TexCoord01.xy).rgb;
	float3 texel1 = tex2D(DiffuseSampler, Input.TexCoord01.zw).rgb;
	float3 texel2 = tex2D(DiffuseSampler, Input.TexCoord23.xy).rgb;
	float3 texel3 = tex2D(DiffuseSampler, Input.TexCoord23.zw).rgb;

	float3 outTexel = (texel0 + texel1 + texel2 + texel3) / 4.0;

	return float4(outTexel, 1.0f);
}

//-----------------------------------------------------------------------------
// Downsample Technique
//-----------------------------------------------------------------------------

technique DefaultTechnique
{
	pass Pass0
	{
		Lighting = FALSE;

		VertexShader = compile vs_2_0 vs_main();
		PixelShader = compile ps_2_0 ps_main();
	}
}