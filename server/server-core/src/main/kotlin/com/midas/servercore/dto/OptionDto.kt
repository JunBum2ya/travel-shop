package com.midas.servercore.dto

import com.midas.servercore.domain.Item
import com.midas.servercore.domain.Option

/**
 * DTO for {@link com.midas.servercore.domain.Option}
 */
data class OptionDto(val name: String, val description: String) {
    fun toEntity(item: Item): Option {
        val option = Option(name = name, description = description, item = item)
        item.options.add(option)
        return option
    }
}