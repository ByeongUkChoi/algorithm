defmodule Solution do
  @spec summary_ranges(nums :: [integer]) :: [String.t()]
  def summary_ranges([]) do
    []
  end

  def summary_ranges([h | t]) do
    t
    |> Enum.reduce([[h]], fn num, [[l | _] = h | t] = acc ->
      if l + 1 == num do
        [[num | h] | t]
      else
        [[num] | acc]
      end
    end)
    |> Enum.map(&Enum.reverse/1)
    |> Enum.reverse()
    |> Enum.map(fn
      [n] -> "#{n}"
      nums -> "#{hd(nums)}->#{Enum.at(nums, -1)}"
    end)
  end
end
