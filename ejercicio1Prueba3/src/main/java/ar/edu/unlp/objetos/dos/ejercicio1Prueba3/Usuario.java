package ar.edu.unlp.objetos.dos.ejercicio1Prueba3;

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
		this.posts.clear();
	}
	
	public boolean cumpleFormato (String tweet) {
		return tweet.length() >= 1 && tweet.length() <= 280;
	}
	
	public void tweetear (String text) {
		if (cumpleFormato(text)) {
			Tweet tweet = new Tweet (this, text);
			this.posts.add(tweet);
		}
	}
	
	public Retweet retweetear (Tweet tweet) {
		Retweet retweet = new Retweet (tweet);
		this.posts.add(retweet);
		tweet.agregarRetweet(retweet);
		return retweet;
	}

	public void eliminarRetweet(Post retweet) {
		this.posts.remove(retweet);
	}

	public List <Post> getPosts () {
		return this.posts;
	}
}
