package com.uv.lismusicjava.track;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TrackApi {
    @GET("playlist/{idPlaylist}/tracks")
    Call<List<Track>> getTracksPlaylist(@Path("idPlaylist") int idPlaylist);
}
