package dev.scmc.pagination

import kotlinx.serialization.Serializable

@Serializable
data class PaginatedList<T>(
    val currentPage: Long,
    val totalPages: Long,
    val pageSize: Int,
    val items: List<T>
)