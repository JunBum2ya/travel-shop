package com.midas.servercore.repository;

import com.midas.servercore.domain.Item
import org.springframework.data.jpa.repository.JpaRepository

interface ItemRepository : JpaRepository<Item, Long> {
}