package com.joel.data.remote.dto

import kotlinx.serialization.Contextual

@kotlinx.serialization.Serializable
data class Links(
    val explorer: List<String>,
    val facebook: List<String>,
    @Contextual val medium: Any,
    val reddit: List<String>,
    val source_code: List<String>,
    val website: List<String>,
    val youtube: List<String>
)