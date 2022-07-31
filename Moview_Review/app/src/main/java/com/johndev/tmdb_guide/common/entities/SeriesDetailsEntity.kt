package com.johndev.tmdb_guide.common.entities

data class SeriesDetailsEntity(
    var adult: Boolean? = null,
    var backdrop_path: String? = null,
    var created_by: List<Any?>? = null,
    var episode_run_time: List<Any?>? = null,
    var first_air_date: String? = null,
    var genres: List<Genres>? = null,
    var homepage: String? = null,
    var id: Int? = null,
    var in_production: Boolean? = null,
    var languages: List<Any?>? = null,
    var last_air_date: String? = null,
    var last_episode_to_air: LastEpisodeToAir? = null,
    var name: String? = null,
    var networks: List<Any?>? = null,
    var next_episode_to_air: NextEpisodeToAir? = null,
    var number_of_episodes: Int? = null,
    var number_of_seasons: Int? = null,
    var origin_country: List<Any?>? = null,
    var original_language: String? = null,
    var original_name: String? = null,
    var overview: String? = null,
    var popularity: Double? = null,
    var poster_path: String? = null,
    var production_companies: List<ProductionCompanies>? = null,
    var production_countries: List<Any?>? = null,
    var seasons: List<Seasons>? = null,
    var spoken_languages: List<SpokenLanguajes>? = null,
    var status: String? = null,
    var tagline: String? = null,
    var type: String? = null,
    var vote_average: Double? = null,
    var vote_count: Int? = null
)