

# MeldenderHinzufugenVorgangDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**meldebereiche** | [**Set&lt;MeldebereichPublicInfoDto&gt;**](MeldebereichPublicInfoDto.md) |  |  [optional] |
|**krankenhausStandorte** | [**Set&lt;KrankenhausStandortDto&gt;**](KrankenhausStandortDto.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OFFEN | &quot;OFFEN&quot; |
| GESCHLOSSEN | &quot;GESCHLOSSEN&quot; |



