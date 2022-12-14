package com.auf.cea.openbreweryapiactivity.models

data class OpenBreweryDBItem(
    var address_2: String?,
    var address_3: String?,
    var brewery_type: String,
    var city: String?,
    var country: String,
    var county_province: String?,
    var created_at: String,
    var id: String,
    var latitude: String?,
    var longitude: String?,
    var name: String,
    var phone: String?,
    var postal_code: String?,
    var state: String?,
    var street: String?,
    var updated_at: String,
    var website_url: String?
): java.io.Serializable