package ar.edu.unlp.info.ej1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Post> posts;
	
	public Usuario (String screenName){
		this.screenName = screenName;
		posts = new ArrayList<> ();
	}
	
	public String getScreenName() {
		return screenName;
	}
	
	public void agregarPost (Post post) {
		this.posts.add(post);
	}
	
	private void eliminarPost (Post post) {
		this.posts.remove(post);
	}
	
	public void eliminarPosts () {
		this.posts.stream().forEach(post -> post.eliminarReferencias());
	}
	
	public boolean cumpleFormato (String tweet) {
		return tweet.length() >= 1 && tweet.length() <= 280;
	}
	
	public void twetear (String text) {
		if (cumpleFormato(text)) {
			Tweet tweet = new Tweet (this, text);
			this.posts.add(tweet);
		}
	}
	
	
}
