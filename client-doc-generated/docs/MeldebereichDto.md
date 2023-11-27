

# MeldebereichDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**antrag** | **String** |  |  [optional] |
|**idmUserId** | **String** |  |  [optional] |
|**krankenhausStandort** | [**KrankenhausStandortDto**](KrankenhausStandortDto.md) |  |  [optional] |
|**bezeichnung** | **String** |  |  [optional] |
|**faelleEcmoJahr** | **Integer** |  |  [optional] |
|**bettenPlankapazitaet** | **Integer** |  |  [optional] |
|**ardsNetzwerkMitglied** | [**ArdsNetzwerkMitgliedEnum**](#ArdsNetzwerkMitgliedEnum) |  |  [optional] |
|**ansprechpartner** | [**List&lt;AnsprechpartnerDto&gt;**](AnsprechpartnerDto.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**letzteMeldung** | **OffsetDateTime** |  |  [optional] |
|**meldebereicheNichtVollstaendig** | **Boolean** |  |  [optional] |
|**lastUpdateTimestamp** | **OffsetDateTime** |  |  [optional] |
|**lastUpdateIdmUserId** | **String** |  |  [optional] |
|**creationIdmUserId** | **String** |  |  [optional] |
|**creationTimestamp** | **OffsetDateTime** |  |  [optional] |
|**deactivationTimestamp** | **OffsetDateTime** |  |  [optional] |
|**deactivationIdmUserId** | **String** |  |  [optional] |
|**deaktivierungsKommentar** | **String** |  |  [optional] |
|**deaktivierungsGrund** | [**DeaktivierungsGrundEnum**](#DeaktivierungsGrundEnum) |  |  [optional] |
|**versorgungsKategorien** | [**List&lt;VersorgungsKategorienEnum&gt;**](#List&lt;VersorgungsKategorienEnum&gt;) |  |  |
|**versorgungsgrad** | [**VersorgungsgradEnum**](#VersorgungsgradEnum) |  |  |
|**behandlungsschwerpunktL1** | [**BehandlungsschwerpunktL1Enum**](#BehandlungsschwerpunktL1Enum) |  |  |
|**behandlungsschwerpunktL2** | [**BehandlungsschwerpunktL2Enum**](#BehandlungsschwerpunktL2Enum) |  |  [optional] |
|**behandlungsschwerpunktL3** | [**BehandlungsschwerpunktL3Enum**](#BehandlungsschwerpunktL3Enum) |  |  [optional] |
|**notfallversorgungsstufe** | [**NotfallversorgungsstufeEnum**](#NotfallversorgungsstufeEnum) |  |  [optional] |



## Enum: ArdsNetzwerkMitgliedEnum

| Name | Value |
|---- | -----|
| JA | &quot;JA&quot; |
| NEIN | &quot;NEIN&quot; |
| UNBEKANNT | &quot;UNBEKANNT&quot; |



## Enum: DeaktivierungsGrundEnum

| Name | Value |
|---- | -----|
| MELDEBEREICH_OHNE_MELDUNG | &quot;MELDEBEREICH_OHNE_MELDUNG&quot; |
| MELDEBEREICH_MIT_INVALIDEN_MELDUNGEN | &quot;MELDEBEREICH_MIT_INVALIDEN_MELDUNGEN&quot; |
| MELDEBEREICH_WIRD_AUFGETEILT | &quot;MELDEBEREICH_WIRD_AUFGETEILT&quot; |
| MEHRERE_MELDEBEREICH_WERDEN_ZUSAMMENGEFUEHRT | &quot;MEHRERE_MELDEBEREICH_WERDEN_ZUSAMMENGEFUEHRT&quot; |
| MELDEBEREICH_MIT_VALIDEN_MELDUNGEN | &quot;MELDEBEREICH_MIT_VALIDEN_MELDUNGEN&quot; |
| WAITING_FOR_ACTIVATION | &quot;WAITING_FOR_ACTIVATION&quot; |



## Enum: List&lt;VersorgungsKategorienEnum&gt;

| Name | Value |
|---- | -----|
| LOW_CARE | &quot;LOW_CARE&quot; |
| HIGH_CARE | &quot;HIGH_CARE&quot; |
| ECMO | &quot;ECMO&quot; |



## Enum: VersorgungsgradEnum

| Name | Value |
|---- | -----|
| UNIVERSITAETSKLINIKUM_MAXIMALVERSORGUNG | &quot;UNIVERSITAETSKLINIKUM_MAXIMALVERSORGUNG&quot; |
| SCHWERPUNKTVERSORGUNG | &quot;SCHWERPUNKTVERSORGUNG&quot; |
| GRUND_UND_REGELVERSORGUNG | &quot;GRUND_UND_REGELVERSORGUNG&quot; |
| FACHKLINIK | &quot;FACHKLINIK&quot; |



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



## Enum: BehandlungsschwerpunktL3Enum

| Name | Value |
|---- | -----|
| LEVEL_1 | &quot;LEVEL_1&quot; |
| LEVEL_2 | &quot;LEVEL_2&quot; |
| PERINATALER_SCHWERPUNKT | &quot;PERINATALER_SCHWERPUNKT&quot; |
| KINDERKARDIOCHIRURGIE_JA | &quot;KINDERKARDIOCHIRURGIE_JA&quot; |
| KINDERKARDIOCHIRURGIE_NEIN | &quot;KINDERKARDIOCHIRURGIE_NEIN&quot; |



## Enum: NotfallversorgungsstufeEnum

| Name | Value |
|---- | -----|
| STUFE1_BASISNOTFALLVERSORGUNG | &quot;STUFE1_BASISNOTFALLVERSORGUNG&quot; |
| STUFE2_ERWEITERTENOTFALLVERSORGUNG | &quot;STUFE2_ERWEITERTENOTFALLVERSORGUNG&quot; |
| STUFE3_UMFASSENDENOTFALLVERSORGUNG | &quot;STUFE3_UMFASSENDENOTFALLVERSORGUNG&quot; |
| KEINE_STUFE | &quot;KEINE_STUFE&quot; |
| STUFE_UNBEKANNT | &quot;STUFE_UNBEKANNT&quot; |



