

# KrankenhausMeldungDataApiDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bezeichnung** | **String** |  |  [optional] |
|**strasse** | **String** |  |  [optional] |
|**hausnummer** | **String** |  |  [optional] |
|**plz** | **String** |  |  [optional] |
|**ort** | **String** |  |  [optional] |
|**bundesland** | [**BundeslandEnum**](#BundeslandEnum) |  |  [optional] |
|**ikNummer** | **String** |  |  [optional] |
|**latitude** | **Double** |  |  [optional] |
|**longitude** | **Double** |  |  [optional] |
|**gemeindeschluessel** | **String** |  |  [optional] |
|**letzteMeldezeitpunkt** | **OffsetDateTime** |  |  [optional] |
|**oldestMeldezeitpunkt** | **OffsetDateTime** |  |  [optional] |
|**faelleCovidAktuell** | **Integer** |  |  [optional] |
|**faelleCovidAktuellBeatmet** | **Integer** |  |  [optional] |
|**faelleCovidAktuellNichtInvasivBeatmet** | **Integer** |  |  [optional] |
|**faelleCovidAktuellEcmo** | **Integer** |  |  [optional] |
|**intensivBettenBelegt** | **Integer** |  |  [optional] |
|**intensivBettenFrei** | **Integer** |  |  [optional] |
|**intensivBettenGesamt** | **Integer** |  |  [optional] |
|**freieIvKapazitaet** | **Integer** |  |  [optional] |
|**freieEcmoKapazitaet** | **Integer** |  |  [optional] |
|**patientenIvBeatmet** | **Integer** |  |  [optional] |
|**patientenEcmoBeatmet** | **Integer** |  |  [optional] |
|**maxBettenStatusEinschaetzungEcmo** | [**MaxBettenStatusEinschaetzungEcmoEnum**](#MaxBettenStatusEinschaetzungEcmoEnum) |  |  [optional] |
|**maxBettenStatusEinschaetzungHighCare** | [**MaxBettenStatusEinschaetzungHighCareEnum**](#MaxBettenStatusEinschaetzungHighCareEnum) |  |  [optional] |
|**maxBettenStatusEinschaetzungDialyse** | [**MaxBettenStatusEinschaetzungDialyseEnum**](#MaxBettenStatusEinschaetzungDialyseEnum) |  |  [optional] |
|**faelleCovidAktuellMitManifestation** | **Integer** |  |  [optional] |
|**faelleCovidAktuellOhneManifestation** | **Integer** |  |  [optional] |
|**faelleCovidAktuellMitManifestationBeatmet** | **Integer** |  |  [optional] |
|**faelleCovidAktuellOhneManifestationBeatmet** | **Integer** |  |  [optional] |
|**faelleCovidAktuellMitManifestationNichtInvasivBeatmet** | **Integer** |  |  [optional] |
|**faelleCovidAktuellOhneManifestationNichtInvasivBeatmet** | **Integer** |  |  [optional] |
|**faelleCovidAktuellMitManifestationEcmo** | **Integer** |  |  [optional] |
|**faelleCovidAktuellOhneManifestationEcmo** | **Integer** |  |  [optional] |
|**faelleCovidAktuellMitManifestationHighFlowOxygen** | **Integer** |  |  [optional] |
|**faelleCovidAktuellOhneManifestationHighFlowOxygen** | **Integer** |  |  [optional] |



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



## Enum: MaxBettenStatusEinschaetzungEcmoEnum

| Name | Value |
|---- | -----|
| VERFUEGBAR | &quot;VERFUEGBAR&quot; |
| BEGRENZT | &quot;BEGRENZT&quot; |
| NICHT_VERFUEGBAR | &quot;NICHT_VERFUEGBAR&quot; |
| KEINE_ANGABE | &quot;KEINE_ANGABE&quot; |



## Enum: MaxBettenStatusEinschaetzungHighCareEnum

| Name | Value |
|---- | -----|
| VERFUEGBAR | &quot;VERFUEGBAR&quot; |
| BEGRENZT | &quot;BEGRENZT&quot; |
| NICHT_VERFUEGBAR | &quot;NICHT_VERFUEGBAR&quot; |
| KEINE_ANGABE | &quot;KEINE_ANGABE&quot; |



## Enum: MaxBettenStatusEinschaetzungDialyseEnum

| Name | Value |
|---- | -----|
| VERFUEGBAR | &quot;VERFUEGBAR&quot; |
| BEGRENZT | &quot;BEGRENZT&quot; |
| NICHT_VERFUEGBAR | &quot;NICHT_VERFUEGBAR&quot; |
| KEINE_ANGABE | &quot;KEINE_ANGABE&quot; |



