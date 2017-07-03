package Data;


import android.content.Context;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class InstanVolley {

    private static InstanVolley mInatanVolley = null;
    private RequestQueue queue;

    private InstanVolley(Context context){
        queue = Volley.newRequestQueue(context);
    }

    public static InstanVolley getInstanceVolley(Context context){

        if (mInatanVolley == null){
            mInatanVolley = new InstanVolley(context);
        }

        return mInatanVolley;
    }

    public RequestQueue getQueue(){
        return queue;
    }

    public static void AddQueque(Request request, RequestQueue requestQueue, Context context, InstanVolley instanVolley){

        if (request != null){
            request.setTag(context);
            if (requestQueue == null){
                requestQueue = instanVolley.getQueue();
                request.setRetryPolicy(new DefaultRetryPolicy(00000, 3,
                        DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
                ));
                requestQueue.add(request);
            }
        }
    }
}
