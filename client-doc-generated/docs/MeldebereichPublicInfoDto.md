

# MeldebereichPublicInfoDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**antrag** | **String** |  |  [optional] |
|**krankenhausStandort** | [**KrankenhausStandortDto**](KrankenhausStandortDto.md) |  |  [optional] |
|**bezeichnung** | **String** |  |  [optional] |
|**ansprechpartner** | [**List&lt;AnsprechpartnerDto&gt;**](AnsprechpartnerDto.md) |  |  [optional] |
|**deactivationTimestamp** | **OffsetDateTime** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**letzteMeldung** | **OffsetDateTime** |  |  [optional] |
|**behandlungsschwerpunktL1** | [**BehandlungsschwerpunktL1Enum**](#BehandlungsschwerpunktL1Enum) |  |  [optional] |
|**behandlungsschwerpunktL2** | [**BehandlungsschwerpunktL2Enum**](#BehandlungsschwerpunktL2Enum) |  |  [optional] |



## Enum: BehandlungsschwerpunktL1Enum

| Name | Value |
|---- | -----|
| ERWACHSENE | &quot;ERWACHSENE&quot; |
| KINDER | &quot;KINDER&quot; |



## Enum: BehandlungsschwerpunktL2Enum

| Name | Value |
|---- | -----|
| PICU | &quot;PICU&quot; |
| NICU | &quot;NICU&quot; |



