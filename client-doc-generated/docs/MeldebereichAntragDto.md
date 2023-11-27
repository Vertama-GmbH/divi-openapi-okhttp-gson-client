

# MeldebereichAntragDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**kommentar** | **String** |  |  [optional] |
|**internerKommentar** | **String** |  |  [optional] |
|**meldebereich** | **String** |  |  [optional] |
|**antragTyp** | [**AntragTypEnum**](#AntragTypEnum) |  |  |
|**titelRueckfragen** | [**TitelRueckfragenEnum**](#TitelRueckfragenEnum) |  |  [optional] |
|**nameRueckfragen** | **String** |  |  [optional] |
|**emailRueckfragen** | **String** |  |  [optional] |
|**telefonRueckfragen** | **String** |  |  [optional] |
|**krankenhaus** | [**KrankenhausStandortDto**](KrankenhausStandortDto.md) |  |  [optional] |
|**loginEmail** | **String** |  |  |
|**meldebereichName** | **String** |  |  [optional] |
|**bettenPlankapazitaet** | **Integer** |  |  [optional] |
|**tags** | **Set&lt;String&gt;** |  |  [optional] |
|**erstellt** | **OffsetDateTime** |  |  [optional] |
|**versorgungsgrad** | [**VersorgungsgradEnum**](#VersorgungsgradEnum) |  |  [optional] |
|**behandlungsschwerpunktL1** | [**BehandlungsschwerpunktL1Enum**](#BehandlungsschwerpunktL1Enum) |  |  [optional] |
|**behandlungsschwerpunktL2** | [**BehandlungsschwerpunktL2Enum**](#BehandlungsschwerpunktL2Enum) |  |  [optional] |
|**behandlungsschwerpunktL3** | [**BehandlungsschwerpunktL3Enum**](#BehandlungsschwerpunktL3Enum) |  |  [optional] |
|**notfallversorgungsstufe** | [**NotfallversorgungsstufeEnum**](#NotfallversorgungsstufeEnum) |  |  [optional] |
|**bundeslaender** | [**Set&lt;BundeslaenderEnum&gt;**](#Set&lt;BundeslaenderEnum&gt;) |  |  [optional] |
|**fancyName** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NEU | &quot;NEU&quot; |
| RUECKSPRACHE | &quot;RUECKSPRACHE&quot; |
| GENEHMIGT | &quot;GENEHMIGT&quot; |
| ABGELEHNT | &quot;ABGELEHNT&quot; |
| NEUER_MELDEBREICH | &quot;NEUER_MELDEBREICH&quot; |
| IN_GENEHMIGUNG | &quot;IN_GENEHMIGUNG&quot; |



## Enum: AntragTypEnum

| Name | Value |
|---- | -----|
| MELDEBEREICH | &quot;MELDEBEREICH&quot; |
| FACHPERSONAL | &quot;FACHPERSONAL&quot; |
| STEUERUNG | &quot;STEUERUNG&quot; |



## Enum: TitelRueckfragenEnum

| Name | Value |
|---- | -----|
| FRAU | &quot;FRAU&quot; |
| HERR | &quot;HERR&quot; |
| DR | &quot;DR&quot; |
| DR_DR | &quot;DR_DR&quot; |
| PROF_DR | &quot;PROF_DR&quot; |
| PROF_DR_DR | &quot;PROF_DR_DR&quot; |



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



## Enum: Set&lt;BundeslaenderEnum&gt;

| Name | Value |
|---- | -----|
| SCHLESWIG_HOLSTEIN | &quot;SCHLESWIG_HOLSTEIN&quot; |
| HAMBURG | &quot;HAMBURG&quot; |
| NIEDERSACHSEN | &quot;NIEDERSACHSEN&quot; |
| BREMEN | &quot;BREMEN&quot; |
| NORDRHEIN_WESTFALEN | &quot;NORDRHEIN_WESTFALEN&quot; |
| HESSEN | &quot;HESSEN&quot; |
| RHEINLAND_PFALZ | &quot;RHEINLAND_PFALZ&quot; |
| BADEN_WUERTTEMBERG | &quot;BADEN_WUERTTEMBERG&quot; |
| BAYERN | &quot;BAYERN&quot; |
| SAARLAND | &quot;SAARLAND&quot; |
| BERLIN | &quot;BERLIN&quot; |
| BRANDENBURG | &quot;BRANDENBURG&quot; |
| MECKLENBURG_VORPOMMERN | &quot;MECKLENBURG_VORPOMMERN&quot; |
| SACHSEN | &quot;SACHSEN&quot; |
| SACHSEN_ANHALT | &quot;SACHSEN_ANHALT&quot; |
| THUERINGEN | &quot;THUERINGEN&quot; |
| DEUTSCHLAND | &quot;DEUTSCHLAND&quot; |



