

# KrankenhausMeldungFullSumDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**letzteMeldezeitpunkt** | **OffsetDateTime** |  |  [optional] |
|**oldestMeldezeitpunkt** | **OffsetDateTime** |  |  [optional] |
|**faelleCovidAktuellMitManifestation** | **Integer** |  |  [optional] |
|**faelleCovidAktuellMitManifestationBeatmet** | **Integer** |  |  [optional] |
|**faelleCovidAktuellMitManifestationNichtInvasivBeatmet** | **Integer** |  |  [optional] |
|**faelleCovidAktuellMitManifestationEcmo** | **Integer** |  |  [optional] |
|**intensivBettenBelegt** | **Integer** |  |  [optional] |
|**intensivBettenFrei** | **Integer** |  |  [optional] |
|**intensivBettenGesamt** | **Integer** |  |  [optional] |
|**freieIvKapazitaet** | **Integer** |  |  [optional] |
|**freieEcmoKapazitaet** | **Integer** |  |  [optional] |
|**patientenIvBeatmet** | **Integer** |  |  [optional] |
|**patientenEcmoBeatmet** | **Integer** |  |  [optional] |
|**intensivBettenNotfall7d** | **Integer** |  |  [optional] |
|**maxBettenStatusEinschaetzungEcmo** | [**MaxBettenStatusEinschaetzungEcmoEnum**](#MaxBettenStatusEinschaetzungEcmoEnum) |  |  [optional] |
|**maxBettenStatusEinschaetzungHighCare** | [**MaxBettenStatusEinschaetzungHighCareEnum**](#MaxBettenStatusEinschaetzungHighCareEnum) |  |  [optional] |
|**maxBettenStatusEinschaetzungDialyse** | [**MaxBettenStatusEinschaetzungDialyseEnum**](#MaxBettenStatusEinschaetzungDialyseEnum) |  |  [optional] |
|**bestBetriebssituation** | [**BestBetriebssituationEnum**](#BestBetriebssituationEnum) |  |  [optional] |



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



## Enum: BestBetriebssituationEnum

| Name | Value |
|---- | -----|
| REGULAERER_BETRIEB | &quot;REGULAERER_BETRIEB&quot; |
| TEILWEISE_EINGESCHRAENKT | &quot;TEILWEISE_EINGESCHRAENKT&quot; |
| EINGESCHRAENKT | &quot;EINGESCHRAENKT&quot; |
| KEINE_ANGABE | &quot;KEINE_ANGABE&quot; |



