package com.midas.servercore.dto

import com.midas.servercore.domain.Item
import java.io.Serializable
import java.util.Collections
import java.util.stream.Collectors

/**
 * DTO for {@link com.midas.servercore.domain.Item}
 */
data class ItemDto(
    val name: String,
    val imagePath: String,
    val description: String,
    val options: MutableSet<OptionDto> = mutableSetOf()
) {
    fun toEntity(): Item {
        val item = Item(name = name, imagePath = imagePath, description = description)
        options.stream().forEach { it.toEntity(item) }
        return item
    }
}