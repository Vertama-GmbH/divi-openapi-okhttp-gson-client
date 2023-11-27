

# MeldungshistorieDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**meldebereich** | [**MeldebereichMeldungshistorieDto**](MeldebereichMeldungshistorieDto.md) |  |  |
|**meldezeitpunkt** | **OffsetDateTime** |  |  [optional] |
|**bettenmeldungen** | [**List&lt;BettenmeldunghistorieDto&gt;**](BettenmeldunghistorieDto.md) |  |  [optional] |
|**faelleCovidAktuell** | **Integer** |  |  [optional] |
|**faelleCovidAktuellBeatmet** | **Integer** |  |  [optional] |
|**faelleCovidGenesen** | **Integer** |  |  [optional] |
|**faelleCovidVerstorben** | **Integer** |  |  [optional] |
|**faelleCovidAktuellHighFlowOxygen** | **Integer** |  |  [optional] |
|**faelleCovidAktuellNichtInvasivBeatmet** | **Integer** |  |  [optional] |
|**faelleCovidAktuellEcmo** | **Integer** |  |  [optional] |
|**faelleCovidOhneSymptomatik** | **Integer** |  |  [optional] |
|**faelleCovidAelterAls17j** | **Integer** |  |  [optional] |
|**covid19StatusV3** | [**Covid19StatushistorieV3Dto**](Covid19StatushistorieV3Dto.md) |  |  [optional] |
|**covidKapazitaetFrei** | **Integer** |  |  [optional] |
|**covidKapazitaetFreiIv** | **Integer** |  |  [optional] |
|**covidKapazitaetFreiECMO** | **Integer** |  |  [optional] |
|**betriebssituation** | [**BetriebssituationEnum**](#BetriebssituationEnum) |  |  [optional] |
|**betriebseinschraenkungPersonal** | **Boolean** |  |  [optional] |
|**betriebseinschraenkungRaum** | **Boolean** |  |  [optional] |
|**betriebseinschraenkungBeatmungsgeraet** | **Boolean** |  |  [optional] |
|**betriebseinschraenkungVerbrauchsmaterial** | **Boolean** |  |  [optional] |
|**apiVersion** | **String** |  |  [optional] |
|**quellsystem** | **String** |  |  [optional] |
|**lastUpdateTimestamp** | **OffsetDateTime** |  |  [optional] |
|**lastUpdateIdmUserId** | **String** |  |  [optional] |
|**creationIdmUserId** | **String** |  |  [optional] |
|**creationTimestamp** | **OffsetDateTime** |  |  [optional] |
|**meldezeitpunktManuellGeaendertTimestamp** | **OffsetDateTime** |  |  [optional] |
|**isLetzteMeldung** | **Boolean** |  |  [optional] |
|**aktiv** | **Boolean** |  |  [optional] |
|**meldungNichtMeldenachweisRelevant** | **Boolean** |  |  [optional] |
|**kapazitaeten** | [**KapazitaetenhistorieDto**](KapazitaetenhistorieDto.md) |  |  [optional] |
|**auspraegung** | [**AuspraegungEnum**](#AuspraegungEnum) |  |  |
|**altersstrata** | [**AltersstratahistorieDto**](AltersstratahistorieDto.md) |  |  [optional] |
|**neuaufnahmen** | [**NeuaufnahmenhistorieDto**](NeuaufnahmenhistorieDto.md) |  |  [optional] |
|**varianten** | [**VariantenhistorieDto**](VariantenhistorieDto.md) |  |  [optional] |
|**schwangereCovidStatus** | [**SchwangereCovidStatushistorieDto**](SchwangereCovidStatushistorieDto.md) |  |  [optional] |
|**impfstatus** | [**ImpfstatushistorieDto**](ImpfstatushistorieDto.md) |  |  [optional] |
|**impfstatusV2** | [**ImpfstatushistorieV2Dto**](ImpfstatushistorieV2Dto.md) |  |  [optional] |
|**rsvStatus** | [**RsvStatushistorieDto**](RsvStatushistorieDto.md) |  |  [optional] |
|**influenzaStatus** | [**InfluenzaStatushistorieDto**](InfluenzaStatushistorieDto.md) |  |  [optional] |
|**pimsStatus** | [**PimsStatushistorieDto**](PimsStatushistorieDto.md) |  |  [optional] |
|**faelleCovidVortagVerlegtVerstorben** | [**FaelleCovidVortagVerlegtVerstorbenDto**](FaelleCovidVortagVerlegtVerstorbenDto.md) |  |  [optional] |



## Enum: BetriebssituationEnum

| Name | Value |
|---- | -----|
| REGULAERER_BETRIEB | &quot;REGULAERER_BETRIEB&quot; |
| TEILWEISE_EINGESCHRAENKT | &quot;TEILWEISE_EINGESCHRAENKT&quot; |
| EINGESCHRAENKT | &quot;EINGESCHRAENKT&quot; |
| KEINE_ANGABE | &quot;KEINE_ANGABE&quot; |



## Enum: AuspraegungEnum

| Name | Value |
|---- | -----|
| V2 | &quot;V2&quot; |
| V1 | &quot;V1&quot; |



