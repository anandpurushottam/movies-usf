package co.kaush.msusf.movies

data class MSMovieViewState(
    val searchBoxText: String? = null,
    val searchedMovieTitle: String = "",
    val searchedMovieRating: String = "",
    val searchedMoviePoster: String = "",
    val searchedMovieReference: MSMovie? = null,
    val adapterList: List<MSMovie> = emptyList()
)

sealed class MSMovieEvent {
    object ScreenLoadEvent : MSMovieEvent()
    data class SearchMovieEvent(val searchedMovieTitle: String = "") : MSMovieEvent()
    object ClickMovieEvent : MSMovieEvent()
    data class ClickMovieFromHistoryEvent(val movieFromHistory: MSMovie) : MSMovieEvent()
}

sealed class MSMovieResult {
    object ScreenLoadResult : MSMovieResult()
    data class SearchMovieResult(val movie: MSMovie) : MSMovieResult()
    data class ClickMovieResult(val clickedMovie: MSMovie?) : MSMovieResult()
}