package com.mytour.hackingrio.domain.ApiObjects.TripAdvaisor;

import java.util.List;

public class ApiRootObject {
    public AddressObj address_obj;
    public String latitude;
    public String rating;
    public String location_id;
    public List<TripType> trip_types;
    public String write_review;
    public List<Ancestor> ancestors;
    public String longitude;
    public Object hours;
    public Object percent_recommended;
    public HotelBooking hotel_booking;
    public ReviewRatingCount review_rating_count;
    public List<Subrating> subratings;
    public RankingData ranking_data;
    public String photo_count;
    public String location_string;
    public String web_url;
    public String price_level;
    public String rating_image_url;
    public List<Award> awards;
    public String name;
    public String num_reviews;
    public Category category;
    public List<Subcategory> subcategory;
    public String see_all_photos;
    private String distance;
    private String bearing;

    public AddressObj getAddress_obj() {
        return address_obj;
    }

    public void setAddress_obj(AddressObj address_obj) {
        this.address_obj = address_obj;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    public List<TripType> getTrip_types() {
        return trip_types;
    }

    public void setTrip_types(List<TripType> trip_types) {
        this.trip_types = trip_types;
    }

    public String getWrite_review() {
        return write_review;
    }

    public void setWrite_review(String write_review) {
        this.write_review = write_review;
    }

    public List<Ancestor> getAncestors() {
        return ancestors;
    }

    public void setAncestors(List<Ancestor> ancestors) {
        this.ancestors = ancestors;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Object getHours() {
        return hours;
    }

    public void setHours(Object hours) {
        this.hours = hours;
    }

    public Object getPercent_recommended() {
        return percent_recommended;
    }

    public void setPercent_recommended(Object percent_recommended) {
        this.percent_recommended = percent_recommended;
    }

    public HotelBooking getHotel_booking() {
        return hotel_booking;
    }

    public void setHotel_booking(HotelBooking hotel_booking) {
        this.hotel_booking = hotel_booking;
    }

    public ReviewRatingCount getReview_rating_count() {
        return review_rating_count;
    }

    public void setReview_rating_count(ReviewRatingCount review_rating_count) {
        this.review_rating_count = review_rating_count;
    }

    public List<Subrating> getSubratings() {
        return subratings;
    }

    public void setSubratings(List<Subrating> subratings) {
        this.subratings = subratings;
    }

    public RankingData getRanking_data() {
        return ranking_data;
    }

    public void setRanking_data(RankingData ranking_data) {
        this.ranking_data = ranking_data;
    }

    public String getPhoto_count() {
        return photo_count;
    }

    public void setPhoto_count(String photo_count) {
        this.photo_count = photo_count;
    }

    public String getLocation_string() {
        return location_string;
    }

    public void setLocation_string(String location_string) {
        this.location_string = location_string;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public String getPrice_level() {
        return price_level;
    }

    public void setPrice_level(String price_level) {
        this.price_level = price_level;
    }

    public String getRating_image_url() {
        return rating_image_url;
    }

    public void setRating_image_url(String rating_image_url) {
        this.rating_image_url = rating_image_url;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum_reviews() {
        return num_reviews;
    }

    public void setNum_reviews(String num_reviews) {
        this.num_reviews = num_reviews;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Subcategory> getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(List<Subcategory> subcategory) {
        this.subcategory = subcategory;
    }

    public String getSee_all_photos() {
        return see_all_photos;
    }

    public void setSee_all_photos(String see_all_photos) {
        this.see_all_photos = see_all_photos;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getBearing() {
        return bearing;
    }

    public void setBearing(String bearing) {
        this.bearing = bearing;
    }
}
