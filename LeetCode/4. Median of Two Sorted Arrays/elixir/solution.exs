defmodule Solution do
  @spec find_median_sorted_arrays(nums1 :: [integer], nums2 :: [integer]) :: float
  def find_median_sorted_arrays(nums1, nums2) do
    list = (nums1 ++ nums2) |> Enum.sort()
    length = length(list)
    if rem(length, 2) == 1 do
        Enum.at(list, floor(length / 2))
    else
        (Enum.at(list, floor(length / 2) - 1) + Enum.at(list, floor(length / 2))) / 2
    end
  end
end
