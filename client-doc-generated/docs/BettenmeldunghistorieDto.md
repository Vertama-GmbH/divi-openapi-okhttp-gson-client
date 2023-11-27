

# BettenmeldunghistorieDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**versorgungskategorie** | [**VersorgungskategorieEnum**](#VersorgungskategorieEnum) |  |  |
|**bettenFrei** | **Integer** |  |  [optional] |
|**bettenBelegt** | **Integer** |  |  [optional] |
|**bettenIn24h** | **Integer** |  |  [optional] |
|**bettenVerfuegbarkeit** | [**BettenVerfuegbarkeitEnum**](#BettenVerfuegbarkeitEnum) |  |  [optional] |



## Enum: VersorgungskategorieEnum

| Name | Value |
|---- | -----|
| LOW_CARE | &quot;LOW_CARE&quot; |
| HIGH_CARE | &quot;HIGH_CARE&quot; |
| ECMO | &quot;ECMO&quot; |



## Enum: BettenVerfuegbarkeitEnum

| Name | Value |
|---- | -----|
| VERFUEGBAR | &quot;VERFUEGBAR&quot; |
| BEGRENZT | &quot;BEGRENZT&quot; |
| NICHT_VERFUEGBAR | &quot;NICHT_VERFUEGBAR&quot; |
| KEINE_ANGABE | &quot;KEINE_ANGABE&quot; |



