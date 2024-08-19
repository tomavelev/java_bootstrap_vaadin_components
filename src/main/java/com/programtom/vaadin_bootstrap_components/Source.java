package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;

/**
 * A Vaadin component for a &lt;source&gt; element.
 */
@SuppressWarnings("unused")
@Tag("source")
public class Source extends Component {

    /**
     * The src the URL of the media file to display
     */
    private String src;

    /**
     * The type of media supported by this source (e.g. "video/webm", etc.).
     */
    private String type;

    /**
     * Constructs a new instance of the Source with the specified src and type options.
     *
     * @param src  the URL of the media file to display
     * @param type the type of media supported by this source
     */
    public Source(String src, String type) {
        this.type = type;
        this.src = src;
    }

    /**
     * Attaches the component to its parent and sets up the  &lt;source&gt; element.
     */

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent);
        getElement().setAttribute("src", getSrc());
        getElement().setAttribute("type", getType());
    }


    /**
     * Gets the type of media supported by this source (e.g. "video/webm", etc.).
     *
     * @return the type of media supported by this source
     */
    public String getType() {
        return type;
    }


    /**
     * The src the URL of the media file to display
     *
     * @return src value
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the src
     * @param src - src attribute value
     */
    public void setSrc(String src) {
        this.src = src;
        getElement().setAttribute("src", src);
    }

    /**
     * Sets the type
     * @param type - type attribute value
     */
    public void setType(String type) {
        this.type = type;
        getElement().setAttribute("type", type);
    }
}