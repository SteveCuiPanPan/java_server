package com.changyu.foryou.service;

import java.util.List;
import java.util.Map;

import com.changyu.foryou.model.Food;
import com.changyu.foryou.model.FoodCategory;
import com.changyu.foryou.model.FoodComment;
import com.changyu.foryou.model.FoodSpecial;
import com.changyu.foryou.model.ShortFood;

public interface FoodService {
	int deleteCategoryByPrimaryKey(Map<String, Object> paramMap);

	int insertCategorySelective(FoodCategory record);

	FoodCategory selectCategoryByPrimaryKey(Map<String, Object> paramMap);

	int updateCategoryByPrimaryKeySelective(FoodCategory record);

	int deleteFoodByPrimaryKey(Map<String, Object> paramMap);

	int insertFoodSelective(Food record);

	Food selectFoodByPrimaryKey(Map<String, Object> paramMap);

	int updateFoodByPrimaryKeySelective(Food record);

	List<FoodCategory>getFirstCategory(Map<String, Object> paramMap);

	//List<FoodCategory> getSecondCategories(Integer id);


	List<FoodSpecial> getFoodSpecial(Map<String, Object> paramMap);

	int insertSelective(FoodComment record);

	Long getCommentCountsById(Map<String, Object> paramMap);

	List<Food> getAllFoods(Map<String, Object> paramMap);

	Integer getFoodSpecialCount(Map<String, Object> paramMap);

	String getSpecialName(Map<String, Object> paramMap);

//	List<FoodCategory> getAllFoodSecondCategories();
//
//	List<FoodCategory> getAllFoodFirstCategories();

	int getSpecialCount(Map<String, Object> paramMap);

	int addFoodSpecial(FoodSpecial foodSpecial);

	Integer getSpecialMax(Map<String, Object> paramMap);

	Integer getFoodCommentCount(Map<String, Object> paramMap);

	Integer insertFoodComment(FoodComment foodComment);

	List<ShortFood> getFoodListDiscount(Map<String, Object> paramMap);

	List<ShortFood> getFoodListFresh(Map<String, Object> paramMap);

	List<ShortFood> getFoodListWelcome(Map<String, Object> paramMap);

	Integer changeFoodCount(Map<String, Object> paramMap);

	Float getAvageGrade(Map<String, Object> paramMap);

	void deleteFoodSpecial(FoodSpecial foodSpecial);

	void updateFoodSpecial(FoodSpecial foodSpecial);

	List<ShortFood> selectFoods(Map<String, Object> paramMap);

	List<ShortFood> selectFoodsByTwoTags(Map<String, Object> paramMap);

	List<FoodComment> getCommentInfoById(Map<String, Object> paramMap);

	Object getAllComments(Map<String, Object> paramMap);

	Integer deleteFoodCommentById(Map<String, Object> paramMap);

	//void deleteFoodByParentCategory(String categoryId);
}
