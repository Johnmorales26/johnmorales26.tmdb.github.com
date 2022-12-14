package com.johndev.tmdb_guide.common.entities

data class KnownFor(
    var adult: Boolean?,
    var backdrop_path: String?,
    var genre_ids: List<Int?>?,
    var id: Int?,
    var media_type: String?,
    var original_language: String?,
    var original_title: String?,
    var overview: String?,
    var poster_path: String?,
    var release_date: String?,
    var title: String?,
    var video: Boolean?,
    var vote_average: Double?,
    var vote_count: Int?
)