package ac.id.atmaluhur.mhs.uas_si6tj_1922500215;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface LecturerJasonPlaceHolderAPI {
    @GET("lecturer.php")
    Call<List<ac.id.atmaluhur.mhs.uas_si6tj_1922500215.lecturerPost>> getPosts(

    );
    @GET("lecturer.php")
    Call<List<ac.id.atmaluhur.mhs.uas_si6tj_1922500215.lecturerPost>> getPosts(@QueryMap Map<String, String> parameters);
}
