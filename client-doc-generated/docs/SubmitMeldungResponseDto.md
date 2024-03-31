

# SubmitMeldungResponseDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**meldebereich** | [**SmallMeldebereichResponseDto**](SmallMeldebereichResponseDto.md) |  |  |
|**meldezeitpunkt** | **OffsetDateTime** |  |  [optional] |
|**faelleCovidAktuell** | **Integer** |  |  [optional] |
|**faelleCovidGenesen** | **Integer** |  |  [optional] |
|**faelleCovidVerstorben** | **Integer** |  |  [optional] |
|**faelleCovidAelterAls17j** | **Integer** |  |  [optional] |
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
|**aktiv** | **Boolean** |  |  [optional] |
|**kapazitaeten** | [**KapazitaetenDto**](KapazitaetenDto.md) |  |  [optional] |
|**auspraegung** | [**AuspraegungEnum**](#AuspraegungEnum) |  |  |
|**altersstrata** | [**AltersstrataDto**](AltersstrataDto.md) |  |  [optional] |
|**neuaufnahmen** | [**SubmitNeuaufnahmenResponseDto**](SubmitNeuaufnahmenResponseDto.md) |  |  [optional] |
|**varianten** | [**VariantenV2Dto**](VariantenV2Dto.md) |  |  [optional] |
|**schwangereCovidStatus** | [**SchwangereCovidStatusDto**](SchwangereCovidStatusDto.md) |  |  [optional] |
|**impfstatusV2** | [**ImpfstatusV2Dto**](ImpfstatusV2Dto.md) |  |  [optional] |
|**rsvStatus** | [**RsvStatusDto**](RsvStatusDto.md) |  |  [optional] |
|**influenzaStatus** | [**InfluenzaStatusDto**](InfluenzaStatusDto.md) |  |  [optional] |
|**covid19StatusV3** | [**Covid19StatusV3Dto**](Covid19StatusV3Dto.md) |  |  [optional] |
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



