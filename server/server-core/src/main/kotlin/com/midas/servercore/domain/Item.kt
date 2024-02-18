package com.midas.servercore.domain

import jakarta.persistence.*

@Entity
class Item(
    @Column(nullable = false, length = 30) var name: String,
    var imagePath: String,
    @Column(length = 1000) var description: String,
    @OneToMany(mappedBy = "item") val options: MutableSet<Option> = mutableSetOf()
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private var id: Long? = null
}