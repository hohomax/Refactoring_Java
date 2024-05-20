package me.whiteship.refactoring._13_loop._33_replace_loop_with_pipeline;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Author {

    private String company;

    private String twitterHandle;

    public Author(String company, String twitterHandle) {
        this.company = company;
        this.twitterHandle = twitterHandle;
    }

    static public List<String> TwitterHandles(List<Author> authors, String company) {
        var result = new ArrayList<String> ();
        for (Author a : authors) {
            if (a.company.equals(company)) {
                var handle = a.twitterHandle;
                if (handle != null)
                    result.add(handle);
            }
        }
        return result;
    }


    /**
     * 이중 for문과 if문으로 되어있는 내용을
     * 자바의 stream을 통해서 리팩토링
     * filter: 특정 조건에 대한 필터 작업
     * map : 특정형태로 변환
     * */
    static public List<String> TwitterHandles_stream(List<Author> authors, String company) {

       return authors.stream()
               .filter( auther-> auther.company.equals(company))
               .filter(b->b.twitterHandle != null)
               .map( c->c.twitterHandle).toList();

    }

}
