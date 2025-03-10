package com.XX.LLD.PRACTICE.FacebookDesign.Design1.Simple.Facebook;

import com.XX.LLD.PRACTICE.FacebookDesign.Design1.Simple.Entities.Post;
import com.XX.LLD.PRACTICE.FacebookDesign.Design1.Simple.Entities.User;

import java.util.HashMap;
import java.util.Map;

public class FaceBook {

    private Map<Integer, Post> postMap;
    private Map<Integer, User> userMap;

    private static FaceBook faceBook;
    private final int PAGE_SIZE = 2;

    /**
     * {@AllArgsConstructor}
     *  @Private typeOf {@Constructor}
     */
    private FaceBook(){
        this.postMap = new HashMap<>();
        this.userMap = new HashMap<>();
    }

    public static FaceBook getInstance(){
        if(faceBook == null){
            return new FaceBook();
        }
        return faceBook;
    }

//    GETTER AND SETTER

    public Map<Integer, Post> getPostMap() {
        return postMap;
    }
    public void setPostMap(Map<Integer, Post> postMap) {
        this.postMap = postMap;
    }

    public Map<Integer, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<Integer, User> userMap) {
        this.userMap = userMap;
    }

    public int getPageSize() {
        return PAGE_SIZE;
    }
}
