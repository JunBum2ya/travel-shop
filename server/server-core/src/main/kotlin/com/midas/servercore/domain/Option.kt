package com.midas.servercore.domain

import jakarta.persistence.*

@Entity
class Option(
    @Column(nullable = false, length = 30) var name: String,
    @Column(length = 1000) var description: String,
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "item_id", nullable = false) val item: Item
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private var id: Long? = null
}