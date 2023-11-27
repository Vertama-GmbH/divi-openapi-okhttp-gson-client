

# KrankenhausMeldungFilterCriteriaPublicDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bundesland** | [**BundeslandEnum**](#BundeslandEnum) |  |  [optional] |
|**gemeindeschluessel** | **List&lt;String&gt;** |  |  [optional] |
|**standortId** | **String** |  |  [optional] |
|**standortBezeichnung** | **String** |  |  [optional] |
|**meldebereichName** | **String** |  |  [optional] |
|**geoSearch** | [**GeoSearchDto**](GeoSearchDto.md) |  |  [optional] |
|**bettenKategorie** | [**List&lt;BettenKategorieEnum&gt;**](#List&lt;BettenKategorieEnum&gt;) |  |  [optional] |
|**bettenStatus** | [**List&lt;BettenStatusEnum&gt;**](#List&lt;BettenStatusEnum&gt;) |  |  [optional] |
|**behandlungsschwerpunktL1** | [**List&lt;BehandlungsschwerpunktL1Enum&gt;**](#List&lt;BehandlungsschwerpunktL1Enum&gt;) |  |  [optional] |
|**behandlungsschwerpunktL2** | [**List&lt;BehandlungsschwerpunktL2Enum&gt;**](#List&lt;BehandlungsschwerpunktL2Enum&gt;) |  |  [optional] |
|**behandlungsschwerpunktL3** | [**List&lt;BehandlungsschwerpunktL3Enum&gt;**](#List&lt;BehandlungsschwerpunktL3Enum&gt;) |  |  [optional] |



## Enum: BundeslandEnum

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



## Enum: List&lt;BettenKategorieEnum&gt;

| Name | Value |
|---- | -----|
| LOW_CARE | &quot;LOW_CARE&quot; |
| HIGH_CARE | &quot;HIGH_CARE&quot; |
| ECMO | &quot;ECMO&quot; |



## Enum: List&lt;BettenStatusEnum&gt;

| Name | Value |
|---- | -----|
| VERFUEGBAR | &quot;VERFUEGBAR&quot; |
| BEGRENZT | &quot;BEGRENZT&quot; |
| NICHT_VERFUEGBAR | &quot;NICHT_VERFUEGBAR&quot; |
| KEINE_ANGABE | &quot;KEINE_ANGABE&quot; |



## Enum: List&lt;BehandlungsschwerpunktL1Enum&gt;

| Name | Value |
|---- | -----|
| ERWACHSENE | &quot;ERWACHSENE&quot; |
| KINDER | &quot;KINDER&quot; |



## Enum: List&lt;BehandlungsschwerpunktL2Enum&gt;

| Name | Value |
|---- | -----|
| PICU | &quot;PICU&quot; |
| NICU | &quot;NICU&quot; |



## Enum: List&lt;BehandlungsschwerpunktL3Enum&gt;

| Name | Value |
|---- | -----|
| LEVEL_1 | &quot;LEVEL_1&quot; |
| LEVEL_2 | &quot;LEVEL_2&quot; |
| PERINATALER_SCHWERPUNKT | &quot;PERINATALER_SCHWERPUNKT&quot; |
| KINDERKARDIOCHIRURGIE_JA | &quot;KINDERKARDIOCHIRURGIE_JA&quot; |
| KINDERKARDIOCHIRURGIE_NEIN | &quot;KINDERKARDIOCHIRURGIE_NEIN&quot; |



