package com.strayswonderland.avatarcreatortool.model

import java.util.UUID

data class Avatar @JvmOverloads constructor(
        val id: UUID = UUID.randomUUID(),
        var title: String? = null,
        var head: String? = null,
        var skinColor: String? = null,
        var eyes: String? = null,
        var eyeColor: String? = null,
        var hair: String? = null,
        var hairColor: String? = null,
        var nose: String? = null,
        var mouth: String? = null) 
