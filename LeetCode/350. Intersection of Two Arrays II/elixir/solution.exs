defmodule Solution do
  @spec intersect(nums1 :: [integer], nums2 :: [integer]) :: [integer]
  def intersect(nums1, nums2) do
    List.myers_difference(Enum.sort(nums1), Enum.sort(nums2))
    |> Enum.reduce([], fn {type, values}, acc ->
      if type == :eq do
        values ++ acc
      else
        acc
      end
    end)
  end
end
