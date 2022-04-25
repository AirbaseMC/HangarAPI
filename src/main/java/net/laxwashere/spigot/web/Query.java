package net.laxwashere.spigot.web;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

import java.io.IOException;

public class Query {

    private OkHttpClient client = new OkHttpClient.Builder().build();

    public JsonObject requestAsJson(String url) {
        JsonObject jsonObject = null;
        try {
            jsonObject = new Gson().fromJson(query(url), JsonObject.class);
        } catch (Exception e) {}
        return jsonObject;
    }

    public String query(String url) {
        try {
            Request req = new Request.Builder().url(url).build();
            ResponseBody body = client.newCall(req).execute().body();
            return body.string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String query(Request req) {
        try {
            ResponseBody body = client.newCall(req).execute().body();
            return body.string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}