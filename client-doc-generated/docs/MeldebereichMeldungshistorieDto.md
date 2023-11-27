

# MeldebereichMeldungshistorieDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**bezeichnung** | **String** |  |  [optional] |
|**aktiv** | **Boolean** |  |  [optional] |
|**deaktivierungsGrund** | [**DeaktivierungsGrundEnum**](#DeaktivierungsGrundEnum) |  |  [optional] |
|**deaktivierungsDatum** | **OffsetDateTime** |  |  [optional] |
|**behandlungsschwerpunktL1** | [**BehandlungsschwerpunktL1Enum**](#BehandlungsschwerpunktL1Enum) |  |  [optional] |
|**behandlungsschwerpunktL2** | [**BehandlungsschwerpunktL2Enum**](#BehandlungsschwerpunktL2Enum) |  |  [optional] |



## Enum: DeaktivierungsGrundEnum

| Name | Value |
|---- | -----|
| MELDEBEREICH_OHNE_MELDUNG | &quot;MELDEBEREICH_OHNE_MELDUNG&quot; |
| MELDEBEREICH_MIT_INVALIDEN_MELDUNGEN | &quot;MELDEBEREICH_MIT_INVALIDEN_MELDUNGEN&quot; |
| MELDEBEREICH_WIRD_AUFGETEILT | &quot;MELDEBEREICH_WIRD_AUFGETEILT&quot; |
| MEHRERE_MELDEBEREICH_WERDEN_ZUSAMMENGEFUEHRT | &quot;MEHRERE_MELDEBEREICH_WERDEN_ZUSAMMENGEFUEHRT&quot; |
| MELDEBEREICH_MIT_VALIDEN_MELDUNGEN | &quot;MELDEBEREICH_MIT_VALIDEN_MELDUNGEN&quot; |
| WAITING_FOR_ACTIVATION | &quot;WAITING_FOR_ACTIVATION&quot; |



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



