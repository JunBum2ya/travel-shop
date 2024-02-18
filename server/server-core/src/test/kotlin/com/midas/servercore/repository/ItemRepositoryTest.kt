package com.midas.servercore.repository

import com.midas.servercore.config.TestConfig
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [TestConfig::class])
class ItemRepositoryTest {

    @Test
    fun givenItem_whenSavingItem_thenReturnsItem() {
        //given
        //when
        //then
    }

}