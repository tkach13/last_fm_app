package com.benten.lastfmapp.presentation.genres

import com.benten.lastfmapp.domain.models.GenresResponseModel

sealed class UiState {
    class Loading : UiState()
    data class Success(val data: GenresResponseModel) : UiState()
    data class Error(val throwable: Throwable) : UiState()
}
