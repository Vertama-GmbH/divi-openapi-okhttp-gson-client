

# MeldebereichDeaktivierungRequestDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**meldebereichId** | **String** |  |  |
|**deaktivierungsGrund** | [**DeaktivierungsGrundEnum**](#DeaktivierungsGrundEnum) |  |  |
|**deaktivierungsKommentar** | **String** |  |  |
|**deaktivierungsDatum** | **LocalDate** |  |  |



## Enum: DeaktivierungsGrundEnum

| Name | Value |
|---- | -----|
| MELDEBEREICH_OHNE_MELDUNG | &quot;MELDEBEREICH_OHNE_MELDUNG&quot; |
| MELDEBEREICH_MIT_INVALIDEN_MELDUNGEN | &quot;MELDEBEREICH_MIT_INVALIDEN_MELDUNGEN&quot; |
| MELDEBEREICH_WIRD_AUFGETEILT | &quot;MELDEBEREICH_WIRD_AUFGETEILT&quot; |
| MEHRERE_MELDEBEREICH_WERDEN_ZUSAMMENGEFUEHRT | &quot;MEHRERE_MELDEBEREICH_WERDEN_ZUSAMMENGEFUEHRT&quot; |
| MELDEBEREICH_MIT_VALIDEN_MELDUNGEN | &quot;MELDEBEREICH_MIT_VALIDEN_MELDUNGEN&quot; |
| WAITING_FOR_ACTIVATION | &quot;WAITING_FOR_ACTIVATION&quot; |



