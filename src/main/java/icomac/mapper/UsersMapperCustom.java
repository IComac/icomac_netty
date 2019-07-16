package icomac.mapper;

import java.util.List;

import icomac.pojo.Users;
import icomac.pojo.vo.FriendRequestVO;
import icomac.pojo.vo.MyFriendsVO;
import icomac.utils.MyMapper;

public interface UsersMapperCustom extends MyMapper<Users> {
	
	public List<FriendRequestVO> queryFriendRequestList(String acceptUserId);

	public List<MyFriendsVO> queryMyFriends(String userId);

	public void batchUpdateMsgSigned(List<String> msgIdList);
}