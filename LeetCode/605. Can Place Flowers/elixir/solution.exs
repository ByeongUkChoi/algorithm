defmodule Solution do
  @spec can_place_flowers(flowerbed :: [integer], n :: integer) :: boolean
  def can_place_flowers(flowerbed, n) do
    list =
      flowerbed
      |> Enum.reduce(%{tmp_cnt: 0, cnts: []}, fn
        0, acc -> Map.update!(acc, :tmp_cnt, &(&1 + 1))
        1, %{tmp_cnt: tmp_cnt, cnts: cnts} -> %{tmp_cnt: 0, cnts: [tmp_cnt | cnts]}
      end)
      |> then(fn %{tmp_cnt: tmp_cnt, cnts: cnts} -> [tmp_cnt | cnts] end)

    list
    |> List.update_at(0, fn n -> if n > 0, do: n + 1, else: n end)
    |> List.update_at(length(list) - 1, fn n -> if n > 0, do: n + 1, else: n end)
    |> Enum.reject(&(&1 == 0))
    |> Enum.reduce(0, fn num, acc ->
      div(num - 1, 2) + acc
    end)
    |> then(&(&1 >= n))
  end
end
