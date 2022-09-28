package com.SimplonMembers.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 64, nullable = false)
    private String email;

    @Column(length = 256, nullable = false)
    @JsonIgnore
    private String password;

    @Column(length = 64, nullable = true)
    private String firstName;

    @Column(length = 64, nullable = true)
    private String lastName;

    @Column(length = 100)
    private String intro;

    @Column(length = 16)
    private String gender;

    @Column(length = 128)
    private String hometown;

    @Column(length = 128)
    private String currentCity;

    @Column(length = 128)
    private String eduInstitution;

    @Column(length = 128)
    private String workplace;

    @Column(length = 256)
    private String profilePhoto;

    @Column(length = 256)
    private String coverPhoto;

    @Column(length = 32, nullable = false)
    private String role;

    private Integer followerCount;
    private Integer followingCount;
    private Boolean enabled;
    private Boolean accountVerified;
    private Boolean emailVerified;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date joinDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dateLastModified;

    @OneToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "follow_users",
            joinColumns = @JoinColumn(name = "followed_id"),
            inverseJoinColumns = @JoinColumn(name = "follower_id")
    )
    private List<User> followerUsers = new ArrayList<>();

    @JsonIgnore
    @ManyToMany(mappedBy = "followerUsers")
    private List<User> followingUsers = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "author", cascade = CascadeType.REMOVE)
    private List<Post> postList;

    @JsonIgnore
    @ManyToMany(mappedBy = "likeList")
    private List<Post> likedPosts = new ArrayList<>();

    @JsonIgnore
    @ManyToMany(mappedBy = "likeList")
    private List<Comment> likedComments = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the intro
	 */
	public String getIntro() {
		return intro;
	}

	/**
	 * @param intro the intro to set
	 */
	public void setIntro(String intro) {
		this.intro = intro;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the hometown
	 */
	public String getHometown() {
		return hometown;
	}

	/**
	 * @param hometown the hometown to set
	 */
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	/**
	 * @return the currentCity
	 */
	public String getCurrentCity() {
		return currentCity;
	}

	/**
	 * @param currentCity the currentCity to set
	 */
	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	/**
	 * @return the eduInstitution
	 */
	public String getEduInstitution() {
		return eduInstitution;
	}

	/**
	 * @param eduInstitution the eduInstitution to set
	 */
	public void setEduInstitution(String eduInstitution) {
		this.eduInstitution = eduInstitution;
	}

	/**
	 * @return the workplace
	 */
	public String getWorkplace() {
		return workplace;
	}

	/**
	 * @param workplace the workplace to set
	 */
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	/**
	 * @return the profilePhoto
	 */
	public String getProfilePhoto() {
		return profilePhoto;
	}

	/**
	 * @param profilePhoto the profilePhoto to set
	 */
	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	/**
	 * @return the coverPhoto
	 */
	public String getCoverPhoto() {
		return coverPhoto;
	}

	/**
	 * @param coverPhoto the coverPhoto to set
	 */
	public void setCoverPhoto(String coverPhoto) {
		this.coverPhoto = coverPhoto;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the followerCount
	 */
	public Integer getFollowerCount() {
		return followerCount;
	}

	/**
	 * @param followerCount the followerCount to set
	 */
	public void setFollowerCount(Integer followerCount) {
		this.followerCount = followerCount;
	}

	/**
	 * @return the followingCount
	 */
	public Integer getFollowingCount() {
		return followingCount;
	}

	/**
	 * @param followingCount the followingCount to set
	 */
	public void setFollowingCount(Integer followingCount) {
		this.followingCount = followingCount;
	}

	/**
	 * @return the enabled
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the accountVerified
	 */
	public Boolean getAccountVerified() {
		return accountVerified;
	}

	/**
	 * @param accountVerified the accountVerified to set
	 */
	public void setAccountVerified(Boolean accountVerified) {
		this.accountVerified = accountVerified;
	}

	/**
	 * @return the emailVerified
	 */
	public Boolean getEmailVerified() {
		return emailVerified;
	}

	/**
	 * @param emailVerified the emailVerified to set
	 */
	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the joinDate
	 */
	public Date getJoinDate() {
		return joinDate;
	}

	/**
	 * @param joinDate the joinDate to set
	 */
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	/**
	 * @return the dateLastModified
	 */
	public Date getDateLastModified() {
		return dateLastModified;
	}

	/**
	 * @param dateLastModified the dateLastModified to set
	 */
	public void setDateLastModified(Date dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * @return the followerUsers
	 */
	public List<User> getFollowerUsers() {
		return followerUsers;
	}

	/**
	 * @param followerUsers the followerUsers to set
	 */
	public void setFollowerUsers(List<User> followerUsers) {
		this.followerUsers = followerUsers;
	}

	/**
	 * @return the followingUsers
	 */
	public List<User> getFollowingUsers() {
		return followingUsers;
	}

	/**
	 * @param followingUsers the followingUsers to set
	 */
	public void setFollowingUsers(List<User> followingUsers) {
		this.followingUsers = followingUsers;
	}

	/**
	 * @return the postList
	 */
	public List<Post> getPostList() {
		return postList;
	}

	/**
	 * @param postList the postList to set
	 */
	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}

	/**
	 * @return the likedPosts
	 */
	public List<Post> getLikedPosts() {
		return likedPosts;
	}

	/**
	 * @param likedPosts the likedPosts to set
	 */
	public void setLikedPosts(List<Post> likedPosts) {
		this.likedPosts = likedPosts;
	}

	/**
	 * @return the likedComments
	 */
	public List<Comment> getLikedComments() {
		return likedComments;
	}

	/**
	 * @param likedComments the likedComments to set
	 */
	public void setLikedComments(List<Comment> likedComments) {
		this.likedComments = likedComments;
	}
}
