package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> =
    map { Pair(it.value, it.key) }
        .fold(mapOf<V, K>()) { acc, item -> acc + item }