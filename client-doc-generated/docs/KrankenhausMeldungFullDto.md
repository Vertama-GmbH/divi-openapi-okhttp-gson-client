

# KrankenhausMeldungFullDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**krankenhausStandort** | [**KrankenhausStandortShortDto**](KrankenhausStandortShortDto.md) |  |  [optional] |
|**letzteMeldezeitpunkt** | **OffsetDateTime** |  |  [optional] |
|**oldestMeldezeitpunkt** | **OffsetDateTime** |  |  [optional] |
|**meldebereiche** | [**Set&lt;MeldebereichFullDto&gt;**](MeldebereichFullDto.md) |  |  [optional] |
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
|**standortAggregates** | [**Map&lt;String, StandortAggregate&gt;**](StandortAggregate.md) |  |  [optional] |
|**intensivBettenNotfall7d** | **Integer** |  |  [optional] |
|**maxBettenStatusEinschaetzungEcmo** | [**MaxBettenStatusEinschaetzungEcmoEnum**](#MaxBettenStatusEinschaetzungEcmoEnum) |  |  [optional] |
|**maxBettenStatusEinschaetzungHighCare** | [**MaxBettenStatusEinschaetzungHighCareEnum**](#MaxBettenStatusEinschaetzungHighCareEnum) |  |  [optional] |



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



