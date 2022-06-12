package me.inassar.demos.socialapp.presentation.chatRoom

import me.inassar.demos.socialapp.domain.model.chatRoom.RoomHistoryList

data class ChatRoomHistoryState(
    val loading: Boolean = false,
    val data: List<RoomHistoryList.RoomHistory> = emptyList(),
    val error: String = ""
)
