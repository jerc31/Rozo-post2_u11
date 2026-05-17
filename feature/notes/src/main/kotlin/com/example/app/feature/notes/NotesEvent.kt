package com.example.app.feature.notes

/**
 * Eventos one-shot que la pantalla debe procesar exactamente UNA vez por
 */
sealed class NotesEvent {
    data class NavigateToDetail(val noteId: String) : NotesEvent()
    data object NoteDeleted : NotesEvent()
    data object RefreshCompleted : NotesEvent()
    data class RefreshFailed(val message: String) : NotesEvent()
}
