defmodule Solution do
  @spec jump(nums :: [integer]) :: integer
  def jump(nums) do
    nums_map = nums |> Enum.with_index() |> Map.new(fn {num, index} -> {index, num} end)
    nums_map |> reverse_jump() |> Map.get(0)
  end

  defp reverse_jump(nums_map) do
    last_index = map_size(nums_map) - 1
    reverse_jump(nums_map, %{last_index => 0}, last_index - 1, last_index + 1)
  end

  defp reverse_jump(_nums_map, dp, position, _nums_length) when position < 0 do
    dp
  end

  defp reverse_jump(nums_map, dp, position, nums_length) do
    max_jump = min(nums_map[position], nums_length - position - 1)

    min =
      if max_jump == 0 do
        9999
      else
        1..max_jump
        |> Enum.map(fn jump -> 1 + dp[position + jump] end)
        |> Enum.min()
      end

    reverse_jump(nums_map, Map.put(dp, position, min), position - 1, nums_length)
  end
end
