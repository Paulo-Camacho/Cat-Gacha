package com.example.mydemoapp.Database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.mydemoapp.Database.GachaDatabase;

import java.util.Objects;

@Entity(tableName = GachaDatabase.USER_ITEM_TABLE)
public class UserToItem {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private int userId;
    private int itemId;

    @Override
    public String toString() {
        return "UserToItem{" +
                "id=" + id +
                ", userId=" + userId +
                ", itemId=" + itemId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserToItem that = (UserToItem) o;
        return id == that.id && userId == that.userId && itemId == that.itemId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, itemId);
    }

    public UserToItem(int userId, int itemId) {
        this.userId = userId;
        this.itemId = itemId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}
