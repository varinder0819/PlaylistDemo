package coding;

public class Songs {

    private String songName;
    private String author;
    private String movieName;
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Songs [songName=" + songName + ", author=" + author + ", movieName=" + movieName + "]";
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
        result = prime * result + ((songName == null) ? 0 : songName.hashCode());
        return result;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Songs other = (Songs) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (movieName == null) {
            if (other.movieName != null)
                return false;
        } else if (!movieName.equals(other.movieName))
            return false;
        if (songName == null) {
            if (other.songName != null)
                return false;
        } else if (!songName.equals(other.songName))
            return false;
        return true;
    }


    /**
     * @return the songName
     */
    public String getSongName() {
        return songName;
    }
    /**
     * @param songName the songName to set
     */
    public void setSongName(String songName) {
        this.songName = songName;
    }
    public Songs(String songName, String author, String movieName) {
        super();
        this.songName = songName;
        this.author = author;
        this.movieName = movieName;
    }
    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }
    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * @return the movieName
     */
    public String getMovieName() {
        return movieName;
    }
    /**
     * @param movieName the movieName to set
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

}