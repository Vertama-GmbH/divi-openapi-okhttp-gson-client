

# ContentDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**shortText** | **String** |  |  [optional] |
|**longText** | **String** |  |  |
|**position** | **Integer** |  |  [optional] |
|**parentId** | **String** |  |  [optional] |
|**tags** | **Set&lt;String&gt;** |  |  [optional] |
|**lastUpdateTimestamp** | **OffsetDateTime** |  |  [optional] |
|**lastUpdateIdmUserId** | **String** |  |  [optional] |
|**creationIdmUserId** | **String** |  |  [optional] |
|**creationTimestamp** | **OffsetDateTime** |  |  [optional] |
|**releaseStatus** | [**ReleaseStatusEnum**](#ReleaseStatusEnum) |  |  |
|**availablePlaceholder** | **String** |  |  [optional] |
|**menuEntries** | **List&lt;String&gt;** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PAGE_ELEMENT | &quot;PAGE_ELEMENT&quot; |
| BLOG | &quot;BLOG&quot; |
| FAQ | &quot;FAQ&quot; |
| ANSPRECHPARTNER | &quot;ANSPRECHPARTNER&quot; |
| EMAIL_TEMPLATE | &quot;EMAIL_TEMPLATE&quot; |



## Enum: ReleaseStatusEnum

| Name | Value |
|---- | -----|
| NOT_RELEASED | &quot;NOT_RELEASED&quot; |
| RELEASED_FOR_LOGGED_IN_USERS | &quot;RELEASED_FOR_LOGGED_IN_USERS&quot; |
| RELEASED_FOR_ALL | &quot;RELEASED_FOR_ALL&quot; |



