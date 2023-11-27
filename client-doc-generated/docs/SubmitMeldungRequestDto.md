

# SubmitMeldungRequestDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**meldebereich** | [**SmallMeldebereichDto**](SmallMeldebereichDto.md) |  |  |
|**faelleCovidAktuell** | **Integer** |  |  [optional] |
|**faelleCovidAktuellBeatmet** | **Integer** |  |  [optional] |
|**faelleCovidAktuellHighFlowOxygen** | **Integer** |  |  [optional] |
|**faelleCovidAktuellNichtInvasivBeatmet** | **Integer** |  |  [optional] |
|**faelleCovidAktuellEcmo** | **Integer** |  |  [optional] |
|**faelleCovidOhneSymptomatik** | **Integer** |  |  [optional] |
|**betriebssituation** | [**BetriebssituationEnum**](#BetriebssituationEnum) |  |  [optional] |
|**betriebseinschraenkungPersonal** | **Boolean** |  |  [optional] |
|**betriebseinschraenkungRaum** | **Boolean** |  |  [optional] |
|**betriebseinschraenkungBeatmungsgeraet** | **Boolean** |  |  [optional] |
|**betriebseinschraenkungVerbrauchsmaterial** | **Boolean** |  |  [optional] |
|**kapazitaeten** | [**SubmitKapazitaetenRequestDto**](SubmitKapazitaetenRequestDto.md) |  |  [optional] |
|**auspraegung** | [**AuspraegungEnum**](#AuspraegungEnum) |  |  |
|**altersstrata** | [**AltersstrataDto**](AltersstrataDto.md) |  |  [optional] |
|**neuaufnahmen** | [**SubmitNeuaufnahmenRequestDto**](SubmitNeuaufnahmenRequestDto.md) |  |  [optional] |
|**varianten** | [**VariantenV2Dto**](VariantenV2Dto.md) |  |  [optional] |
|**schwangereCovidStatus** | [**SchwangereCovidStatusDto**](SchwangereCovidStatusDto.md) |  |  [optional] |
|**impfstatus** | [**ImpfstatusDto**](ImpfstatusDto.md) |  |  [optional] |
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



