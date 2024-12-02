package com.programtom.components;

import com.vaadin.flow.component.html.Div;

/**
 *
 */
public class RichTextArea extends Div {

    /**
     *
     */
    public RichTextArea(String html) {

        /*
        // potentially choose between these two:
          <script src="https://cdn.jsdelivr.net/npm/quill@2.0.2/dist/quill.js"></script>
<link href="https://cdn.jsdelivr.net/npm/quill@2.0.2/dist/quill.snow.css" rel="stylesheet">

<link href="https://cdn.jsdelivr.net/npm/quill@2.0.2/dist/quill.core.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/quill@2.0.2/dist/quill.core.js"></script>
         */

        getElement().executeJs("""
                $0.innerHTML = $1;
                if(navigator['is_quill_injected'] === true){
                    return;
                }
                
                 var script = document.createElement('script');
                  script.src = "https://cdn.jsdelivr.net/npm/quill@2.0.2/dist/quill.js";
                  document.head.appendChild(script);
                
                   var link = document.createElement('link');
                    link.rel = "stylesheet";
                    link.href = "https://cdn.jsdelivr.net/npm/quill@2.0.2/dist/quill.snow.css";
                    link.onload = function() {
                      // Your callback code here
                    };
                    document.head.appendChild(link);
                
                    navigator['is_quill_injected'] = true;
                
                setTimeout( () {
                    navigator['quill'] = new Quill('#editor', {
                    theme: 'snow'
                  });
                }, 2000 );

                """, this, html);
    }

    /**
     * @param html
     */
    public void setHtml(String html) {
        getElement().executeJs("""
                                $0.innerHTML = $1;
                """, this, html);
    }

    /**
     * @param html
     */
    public void getHTML(RichTextAreaHtml html) {
        getElement().executeJs("""
                   return navigator['quill'].getContents();
                """).then(jsonValue -> html.result(jsonValue.toString()));
    }

    /**
     *
     */
    public interface RichTextAreaHtml {
        void result(String html);
    }
}
